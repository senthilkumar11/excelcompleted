package com.premium.stc.service;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.premium.stc.dao.StockPriceDao;
import com.premium.stc.model.StockPrice;

@Service
public class UploadService {
	@Autowired
	StockPriceDao stockPriceDao;
	public List<StockPrice> upload(MultipartFile file) throws Exception {
		Path tempDir = Files.createTempDirectory("");

		File tempFile = tempDir.resolve(file.getOriginalFilename()).toFile();

		file.transferTo(tempFile);

		Workbook workbook = WorkbookFactory.create(tempFile);

		Sheet sheet = workbook.getSheetAt(0);
		DataFormatter dataFormatter = new DataFormatter();
		List<StockPrice> list = new ArrayList<>();
		int flag = 0;
		for (Row row : sheet) {
			int i = 0;
			if (row.getRowNum() > 0) {
				StockPrice stockPrice = new StockPrice();
				for (Cell cell : row) {
					String cellValue = dataFormatter.formatCellValue(cell);
					if (cellValue.equals("")) {
						flag = 1;
						break;
					}
					i++;
					switch (i) {
					case 1:
						int companyCode = (int) Double.parseDouble(cellValue);
						stockPrice.setCompanyCode(companyCode);
						break;
					case 2:
						double price = Double.parseDouble(cellValue);
						stockPrice.setCurrentPrice(price);
						break;
					case 3:
						String stockEx = cellValue;
						stockPrice.setStockExchange(stockEx);
						break;
					case 4:
						Date date = cell.getDateCellValue();
						stockPrice.setDate(date);
						break;
						
					case 5:
						DateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
						DateFormat datefm = new SimpleDateFormat("dd/MM/yyyy");
						DateFormat time = new SimpleDateFormat(" HH:mm:ss");
						Date dateobj = cell.getDateCellValue();
						String dateTime=(datefm.format(stockPrice.getDate()))+time.format(dateobj);
						stockPrice.setDate(df.parse(dateTime));
						break;
					}

				}
				if (flag == 1)
					break;
//				stockPriceDao.save(stockPrice);
				list.add(stockPrice);

			}
		}
		return list;
	}

}

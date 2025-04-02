package utilityjava;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFCell;
public class readxlsx {

	@DataProvider(name="test")

    public static ArrayList<String> provider(String sheetName, String rowNum) throws IOException {
        // Define the path to the Excel file
        File path = new File("./src/test/resources/testdata/google1.xlsx");

        // Initialize FileInputStream and XSSFWorkbook to read the Excel file
        try (FileInputStream dataReader = new FileInputStream(path);
             XSSFWorkbook workbook = new XSSFWorkbook(dataReader)) {

            // Get the sheet by name
            XSSFSheet sheet = workbook.getSheet(sheetName);
            
            // Check if the sheet exists
            if (sheet == null) {
                throw new IllegalArgumentException("Sheet not found: " + sheetName);
            }

            // Initialize ArrayList to store the row data
            ArrayList<String> list = new ArrayList<>();
            DataFormatter format = new DataFormatter();  // Used for formatting cell values

            // Get total number of rows in the sheet
            int noOfRows = sheet.getPhysicalNumberOfRows();

            // Parse the rowNum to an integer
            int rowIndex = Integer.parseInt(rowNum);

            // Check if the row index is within valid bounds
            if (rowIndex >= 0 && rowIndex < noOfRows) {
                XSSFRow row = sheet.getRow(rowIndex);  // Get the specified row

                if (row != null) {
                    // Get the total number of cells in the row
                    int noOfCells = row.getLastCellNum();
                    // Iterate through all the cells in the row
                    for (int j = 0; j < noOfCells; j++) {
                        XSSFCell cell = row.getCell(j);  // Get each cell
                        if (cell != null) {
                            // Add formatted cell value to the list
                            list.add(format.formatCellValue(cell));
                        }
                    }
                }
            } else {
                System.out.println("Row index out of range: " + rowIndex);
            }

            return list;  // Return the list containing the cell values of the row
        }
    }
}

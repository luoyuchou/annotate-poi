package me.dfzhang.excel.test;

import me.dfzhang.excel.AnnotationResolver;
import me.dfzhang.excel.ExcelModel;
import me.dfzhang.excel.annotation.ExcelCell;
import me.dfzhang.excel.annotation.ExcelTemplate;
import me.dfzhang.excel.util.ReflectUtils;

/**
 * @ClassName ExportTest
 * 
 * @Version v1.0
 * @Date 2017年12月6日 上午1:04:34
 * @Author 854154025@qq.com
 * 
 * @Description TODO
 * 
 */
public class ExportTest {

	public static void main(String[] args) {
		ExcportTemplate excportTemplate = new ExcportTemplate();
		Class<?> clazz = excportTemplate.getClass();
		System.out.println(clazz.isAnnotationPresent(ExcelCell.class));
		System.out.println(ReflectUtils.getClassName(clazz));
		try {
			System.out.println(clazz.getMethod("setName", String.class));
		} catch (NoSuchMethodException | SecurityException e) {
			e.printStackTrace();
		}
		// File testFolder = new File("D:\\excel\\");
		// ExcelModel excelModel = new AnnotationResolver(ExcportTemplate.class).resolve();
		// excelModel.createEditor().exporter().as(testFolder);
		// excelModel.createEditor().exporter().as(testFolder);
		// excelModel.createEditor().exporter().as(testFolder);
		// excelModel.createEditor().exporter().as(testFolder);
		// File file = new File("D:\\exceltest\\hello\\mm\\aa\\bb\\");
		// System.out.println(file.exists());
		// System.out.println(file.isDirectory());
		// if (!file.exists()) {
		// int index = file.getName().indexOf('.');
		// if (index < 0) {
		// // 当作目录
		// file.mkdirs();
		// } else {
		// System.out.println("filp");
		// file.getParentFile().mkdirs();
		// }
		// }
		// System.out.println(file.isDirectory());
	}
}

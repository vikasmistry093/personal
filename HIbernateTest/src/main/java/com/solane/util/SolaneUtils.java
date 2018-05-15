package com.solane.util;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.solane.constants.SolaneConstants;
import com.solane.mapper.model.ProductInfo;
import com.solane.model.Category;
import com.solane.model.Image;
import com.solane.model.Product;

public class SolaneUtils {
	
	
	public static void uploadImageFile(ProductInfo productInfo, MultipartFile file) throws IOException {
		byte[] bytes = file.getBytes();

		File dir = new File(SolaneConstants.ROOT_DIR);
		if (!dir.exists())
			dir.mkdirs();

		File serverFile = new File(dir.getAbsolutePath()
				+ SolaneConstants.FILE_SEPARATOR + file.getOriginalFilename());
		BufferedOutputStream stream = new BufferedOutputStream(
				new FileOutputStream(serverFile));
		stream.write(bytes);
		stream.close();

	}
	
	public static Double getTotalAmountOfProducts(List<ProductInfo> orderProducts) {
		Double amount = 0D;
		for(ProductInfo product: orderProducts)
			amount += product.getPrice();
		return amount;
	}
	
	public static Timestamp getCurrentTimeStamp() {
		return new Timestamp(System.currentTimeMillis());
	}
	
	public static List<Product> setProduct() {
		Timestamp timeStamp = new Timestamp(System.currentTimeMillis());
		
		List<Category> categoryList = new ArrayList<>();
		List<Image> imageList = new ArrayList<>();
		
		Category category = new Category();
		category.setName("Electronics");
		category.setStatus("ACTIVE");
		category.setCreatedTimestamp(timeStamp);
		category.setUpdatedTimestamp(timeStamp);
		
		Category category1 = new Category();
		category1.setName("Mobile");
		category1.setStatus("ACTIVE");
		category1.setCreatedTimestamp(timeStamp);
		category1.setUpdatedTimestamp(timeStamp);
		
		categoryList.add(category);
		categoryList.add(category1);
		
		Image image = new Image();
		image.setImageTitle("NOKIAX2100");
		image.setImageURL("mi-redmi.jpeg");
		image.setStatus("ACTIVE");
		
		imageList.add(image);
		
		Product p1 = new Product();
		p1.setProductTitle("Nokia Phone X2");
		p1.setDescription("NOkia Phone. \n Ram: 2GB \n Memory: 8GB");
		p1.setDiscount(10D);
		p1.setFeatures("2GB Ram. \n 8GB Memory.");
		p1.setPrice(10000D);
		p1.setProductCategory(categoryList);
		p1.setProuctImages(imageList);
		p1.setCreatedTimestamp(timeStamp);
		p1.setUpdatedTimestamp(timeStamp);
		p1.setStatus("ACTIVE");
		
		imageList = new ArrayList<>();
		Image image1 = new Image();
		image1.setImageTitle("NOKIAX2101");
		image1.setImageURL("mob-image.jpeg");
		image1.setStatus("ACTIVE");
		imageList.add(image1);
		
		Product p2 = new Product();
		p2.setProductTitle("Nokia Phone X3");
		p2.setDescription("NOkia Phone. \n Ram: 2GB \n Memory: 8GB");
		p2.setDiscount(10D);
		p2.setFeatures("2GB Ram. \n 8GB Memory.");
		p2.setPrice(11000D);
		p2.setProductCategory(categoryList);
		p2.setProuctImages(imageList);
		p2.setCreatedTimestamp(timeStamp);
		p2.setUpdatedTimestamp(timeStamp);
		p2.setStatus("ACTIVE");
		
		imageList = new ArrayList<>();
		Image image2 = new Image();
		image2.setImageTitle("NOKIAX2102");
		image2.setImageURL("mi-redmi.jpeg");
		image2.setStatus("ACTIVE");
		imageList.add(image2);
		
		Product p3 = new Product();
		p3.setProductTitle("Nokia Phone X4");
		p3.setDescription("NOkia Phone. \n Ram: 2GB \n Memory: 8GB");
		p3.setDiscount(13D);
		p3.setFeatures("2GB Ram. \n 8GB Memory.");
		p3.setPrice(13000D);
		p3.setProductCategory(categoryList);
		p3.setProuctImages(imageList);
		p3.setCreatedTimestamp(timeStamp);
		p3.setUpdatedTimestamp(timeStamp);
		p3.setStatus("ACTIVE");
		
		imageList = new ArrayList<>();
		Image image3 = new Image();
		image3.setImageTitle("NOKIAX2103");
		image3.setImageURL("mob-image.jpeg");
		image3.setStatus("ACTIVE");
		imageList.add(image3);
		
		Product p4 = new Product();
		p4.setProductTitle("Nokia Phone X5");
		p4.setDescription("NOkia Phone. \n Ram: 2GB \n Memory: 8GB");
		p4.setDiscount(12D);
		p4.setFeatures("2GB Ram. \n 8GB Memory.");
		p4.setPrice(14000D);
		p4.setProductCategory(categoryList);
		p4.setProuctImages(imageList);
		p4.setCreatedTimestamp(timeStamp);
		p4.setUpdatedTimestamp(timeStamp);
		p4.setStatus("ACTIVE");
		
		imageList = new ArrayList<>();
		Image image4 = new Image();
		image4.setImageTitle("NOKIAX2104");
		image4.setImageURL("mi-redmi.jpeg");
		image4.setStatus("ACTIVE");
		imageList.add(image4);
	
		Product p5 = new Product();
		p5.setProductTitle("Nokia Phone X6");
		p5.setDescription("NOkia Phone. \n Ram: 2GB \n Memory: 8GB");
		p5.setDiscount(15D);
		p5.setFeatures("2GB Ram. \n 8GB Memory.");
		p5.setPrice(13200D);
		p5.setProductCategory(categoryList);
		p5.setProuctImages(imageList);
		p5.setCreatedTimestamp(timeStamp);
		p5.setUpdatedTimestamp(timeStamp);
		p5.setStatus("ACTIVE");
		
		imageList = new ArrayList<>();
		Image image5 = new Image();
		image5.setImageTitle("NOKIAX2105");
		image5.setImageURL("mob-image.jpeg");
		image5.setStatus("ACTIVE");
		imageList.add(image5);
		
		Product p6 = new Product();
		p6.setProductTitle("Nokia Phone X7");
		p6.setDescription("NOkia Phone. \n Ram: 2GB \n Memory: 8GB");
		p6.setDiscount(15D);
		p6.setFeatures("2GB Ram. \n 8GB Memory.");
		p6.setPrice(13200D);
		p6.setProductCategory(categoryList);
		p6.setProuctImages(imageList);
		p6.setCreatedTimestamp(timeStamp);
		p6.setUpdatedTimestamp(timeStamp);
		p6.setStatus("ACTIVE");
		
		imageList = new ArrayList<>();
		Image image6 = new Image();
		image6.setImageTitle("NOKIAX2106");
		image6.setImageURL("mi-redmi.jpeg");
		image6.setStatus("ACTIVE");
		imageList.add(image6);
		
		Product p7 = new Product();
		p7.setProductTitle("Nokia Phone X8");
		p7.setDescription("NOkia Phone. \n Ram: 2GB \n Memory: 8GB");
		p7.setDiscount(15D);
		p7.setFeatures("2GB Ram. \n 8GB Memory.");
		p7.setPrice(13200D);
		p7.setProductCategory(categoryList);
		p7.setProuctImages(imageList);
		p7.setCreatedTimestamp(timeStamp);
		p7.setUpdatedTimestamp(timeStamp);
		p7.setStatus("ACTIVE");
		
		imageList = new ArrayList<>();
		Image image7 = new Image();
		image7.setImageTitle("NOKIAX2107");
		image7.setImageURL("mob-image.jpeg");
		image7.setStatus("ACTIVE");
		imageList.add(image7);
		
		Product p8 = new Product();
		p8.setProductTitle("Nokia Phone X9");
		p8.setDescription("NOkia Phone. \n Ram: 2GB \n Memory: 8GB");
		p8.setDiscount(15D);
		p8.setFeatures("2GB Ram. \n 8GB Memory.");
		p8.setPrice(13200D);
		p8.setProductCategory(categoryList);
		p8.setProuctImages(imageList);
		p8.setCreatedTimestamp(timeStamp);
		p8.setUpdatedTimestamp(timeStamp);
		p8.setStatus("ACTIVE");
		
		imageList = new ArrayList<>();
		Image image8 = new Image();
		image8.setImageTitle("NOKIAX2108");
		image8.setImageURL("mi-redmi.jpeg");
		image8.setStatus("ACTIVE");
		imageList.add(image8);
		
		Product p9 = new Product();
		p9.setProductTitle("Nokia Phone X");
		p9.setDescription("NOkia Phone. \n Ram: 2GB \n Memory: 8GB");
		p9.setDiscount(15D);
		p9.setFeatures("2GB Ram. \n 8GB Memory.");
		p9.setPrice(13200D);
		p9.setProductCategory(categoryList);
		p9.setProuctImages(imageList);
		p9.setCreatedTimestamp(timeStamp);
		p9.setUpdatedTimestamp(timeStamp);
		p9.setStatus("ACTIVE");
	
		imageList = new ArrayList<>();
		Image image9 = new Image();
		image9.setImageTitle("NOKIAX2109");
		image9.setImageURL("mob-image.jpeg");
		image9.setStatus("ACTIVE");
		imageList.add(image9);
		
		Product p10 = new Product();
		p10.setProductTitle("Nokia Phone XX");
		p10.setDescription("NOkia Phone. \n Ram: 2GB \n Memory: 8GB");
		p10.setDiscount(15D);
		p10.setFeatures("2GB Ram. \n 8GB Memory.");
		p10.setPrice(13200D);
		p10.setProductCategory(categoryList);
		p10.setProuctImages(imageList);
		p10.setCreatedTimestamp(timeStamp);
		p10.setUpdatedTimestamp(timeStamp);
		p10.setStatus("ACTIVE");
	
		List<Product> products = new ArrayList<>();
		products.add(p1);
		products.add(p2);
		products.add(p3);
		products.add(p4);
		products.add(p5);
		products.add(p6);
		products.add(p7);
		products.add(p8);
		products.add(p9);
		products.add(p10);
		
		return products;
	}

}
 
package com.solane.mapper;

import java.util.List;
import java.util.stream.Collectors;

import javax.transaction.Transactional;

import org.springframework.stereotype.Component;

import com.solane.mapper.model.ImageInfo;
import com.solane.model.Image;

@Component
@Transactional
public class ImageMapper {
	
	public static ImageInfo convertIntoImageInfo(Image image) {
		ImageInfo imageInfo = new ImageInfo();
		imageInfo.setImageId(image.getImageId());
		imageInfo.setImageTitle(image.getImageTitle());
		imageInfo.setImageURL(image.getImageURL());
		imageInfo.setStatus(image.getStatus());
		
		return imageInfo;
	}
	
	public static Image convertIntoImage(ImageInfo imageInfo) {
		Image image = new Image();
		image.setImageId(imageInfo.getImageId());
		image.setImageTitle(imageInfo.getImageTitle());
		image.setImageURL(imageInfo.getImageURL());
		image.setStatus(imageInfo.getStatus());
		
		return image;
	}

	public static List<Image> convertIntoImageList(List<ImageInfo> prouctImagesInfo) {
		return prouctImagesInfo.stream()
				.map(ImageMapper::convertIntoImage)
				.collect(Collectors.toList());
	}
	
	public static List<ImageInfo> convertIntoImageInfoList(List<Image> productImages) {
		return productImages.stream()
				.map(ImageMapper::convertIntoImageInfo)
				.collect(Collectors.toList());
	}

}

package com.solane.mapper;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.solane.mapper.model.ImageInfo;
import com.solane.model.Image;

@Component
public class ImageMapper {
	
	public static List<ImageInfo> convertIntoImageInfoList(List<Image> images) {
		return images.stream()
				.map(ImageMapper::convertIntoImageInfo)
				.collect(Collectors.toList());
	}
	
	public static ImageInfo convertIntoImageInfo(Image image) {
		ImageInfo imageInfo = new ImageInfo();
		imageInfo.setImageId(image.getImageId());
		imageInfo.setImageTitle(image.getImageTitle());
		imageInfo.setImageURL(image.getImageURL());
		imageInfo.setStatus(image.getStatus());
		
		return imageInfo;
	}

}

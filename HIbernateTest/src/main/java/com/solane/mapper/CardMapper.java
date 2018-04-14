package com.solane.mapper;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.solane.mapper.model.CardInfo;
import com.solane.model.Card;

@Component
public class CardMapper {
	
	public static Card convertIntoCard(CardInfo cardInfo) {
		Card card = new Card();
		card.setCardId(cardInfo.getCardId());
		card.setCardNumber(cardInfo.getCardNumber());
		card.setExpiryDate(cardInfo.getExpiryDate());
		card.setOwnerName(cardInfo.getOwnerName());
		return card;
	}
	
	public static CardInfo convertIntoCardInfo(Card card) {
		CardInfo cardInfo = new CardInfo();
		cardInfo.setCardId(card.getCardId());
		cardInfo.setCardNumber(card.getCardNumber());
		cardInfo.setExpiryDate(card.getExpiryDate());
		cardInfo.setOwnerName(card.getOwnerName());
		return cardInfo;
	}

	public static List<Card> convertIntoCardList(List<CardInfo> cardInfoList) {
		return cardInfoList.stream()
				.map(CardMapper::convertIntoCard)
				.collect(Collectors.toList());
	}

	public static List<CardInfo> convertIntoCardInfoList(List<Card> cardList) {
		return cardList.stream()
				.map(CardMapper::convertIntoCardInfo)
				.collect(Collectors.toList());
	}

}

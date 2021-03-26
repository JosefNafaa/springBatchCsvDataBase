package com.example.demo.processor;

import java.text.SimpleDateFormat;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

import com.example.demo.dao.BankTransaction;

@Component
public class BankTransactionItemProcessor implements ItemProcessor<BankTransaction, BankTransaction> {
	private SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy-HH:mm");

	@Override
	public BankTransaction process(BankTransaction bankTransaction) throws Exception {
		System.out.println("ana processor");
		bankTransaction.setTransctionDate(dateFormat.parse(bankTransaction.getStrTransactionDate()));
		return bankTransaction;
	}

}

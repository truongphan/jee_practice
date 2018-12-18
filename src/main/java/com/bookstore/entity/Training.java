package com.bookstore.entity;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonObjectBuilder;

public class Training {
	private static final SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
	public static void main(String[] args) {
		
		Date createDate = new Date(Long.valueOf("1542613952051"));
		
		simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
		System.out.println(simpleDateFormat.format(createDate));
	}

}

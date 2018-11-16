package com.transportscan.controllers;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.transportscan.model.ScanInput;
import com.transportscan.response.BaseResponse;
import com.transportscan.services.TransportScanService;

@RestController
public class BaseController {
	

	
	@Autowired
	private TransportScanService transportService;
	
	
	@GetMapping("/sc")
	public String getl() {
		return "qwe";
	}
	
	@PostMapping("/scan")
	@ResponseBody
	public BaseResponse processScan(@RequestBody ScanInput input) {
		//all validation calls to Service Class
		transportService.getStatus();
		
		//need to know from where we will get our response info from what condition
		//as of now harcording the values
		BaseResponse response = new BaseResponse();
		response.setProgram("shipmentstatus");
		response.setVersion("v1");
		response.setRelease("25");
		response.setDatetime("26-10-06T19:55:10Z");
		response.setTimestamp("123423423454334");
		response.setStatus("success");
		response.setCode(200);
		response.setMessage("OK");
		HashMap<String, String> data= new HashMap<>();
		data.put("guid", "1234567");
		data.put("duration","33.2342345");
		response.setData(data);
		return response;
		
	}
}

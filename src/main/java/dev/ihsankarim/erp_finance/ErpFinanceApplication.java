package dev.ihsankarim.erp_finance;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "dev.ihsankarim.erp_finance.model")
public class ErpFinanceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ErpFinanceApplication.class, args);
	}

}

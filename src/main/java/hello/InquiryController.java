package hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InquiryController {

	//private static final String TEMPLATE = "You have inquired about item %s in store %s";
	
	@RequestMapping("/inquiry")
	public Inquiry inquiry(@RequestParam(value="item") String item, @RequestParam(value="store", defaultValue="Walmart") String store) {		
		return new Inquiry(item, store);		
	}
}

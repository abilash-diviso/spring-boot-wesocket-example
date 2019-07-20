package pac.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebSocketRestController {
	private final SimpMessagingTemplate template;

	@Autowired
	WebSocketRestController(SimpMessagingTemplate template) {
		this.template = template;
	}

	@GetMapping("/message")
	public void sendMessage() {
		System.out.println("Message is yet to send ");
		template.convertAndSend("/chat", "Notification Order accepted");
	}

}

package springbootexample;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import springbootexample.jpa.GuestTextEntry;

@Controller
@RequestMapping( "/" )
public class WebController {

	final GuestTextRepository textRepository;

	@Autowired
	public WebController( final GuestTextRepository textRepository ) {

		this.textRepository = textRepository;
	}

	@GetMapping
	public String home( final Map<String, Object> model ) {

		model.put( "message", "Hello World!" );
		return "home";
	}

	@PostMapping
	public String submit( final String text, final Map<String, Object> model ) {

		textRepository.save( new GuestTextEntry( text ) );
		return "redirect:/";
	}
}

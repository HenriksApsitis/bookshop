package com.bookshop;

import com.bookshop.book.Book;
import com.bookshop.book.BookRepository;
import com.bookshop.user.User;
import com.bookshop.user.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.domain.Sort;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@Controller
public class BookshopApplication {

	private final BookRepository bookRepository;

	public BookshopApplication(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(BookshopApplication.class, args);
	}

	@GetMapping(path={"/", "/home"})
	public String index(Model model){
		model.addAttribute("bookList", bookRepository.findAll(Sort.by(Sort.Direction.DESC, "id")));
		return "home";
	}
	@PreAuthorize("hasRole('ADMIN')")
	@GetMapping("/book/add")
	public String getBooks(Model model){
		model.addAttribute("bookList", bookRepository.findAll(Sort.by(Sort.Direction.DESC, "id")));
		model.addAttribute(new Book());
		return "addBook";
	}

	@Bean
	CommandLineRunner commandLineRunner(UserRepository usersRepository, PasswordEncoder encoder, BookRepository bookRepository){
		return args -> {
			//Adding users for testing
			usersRepository.save(new User( "AUser", "user@bookstore.com", encoder.encode("password"), "ROLE_USER,ROLE_ADMIN"));
			//Adding the books for testing
			bookRepository.save(new Book("Fundamentals of Wavelets", 212));
			bookRepository.save(new Book("Data Smart", 235));
			bookRepository.save(new Book("God Created the Integers", 197));
			bookRepository.save(new Book("Superfreakonomics", 179));
			bookRepository.save(new Book("Orientalism", 197));
			bookRepository.save(new Book("Nature of Statistical Learning Theory, The", 230));
			bookRepository.save(new Book("Integration of the Indian States", 217));
			bookRepository.save(new Book("Drunkards Walk, The", 197));
			bookRepository.save(new Book("Image Processing & Mathematical Morphology", 241));
			bookRepository.save(new Book("How to Think Like Sherlock Holmes", 240));
			bookRepository.save(new Book("Data Scientists at Work", 230));
			bookRepository.save(new Book("Slaughterhouse Five", 198));
			bookRepository.save(new Book("Birth of a Theorem", 234));
			bookRepository.save(new Book("Structure & Interpretation of Computer Programs", 240));
			bookRepository.save(new Book("Age of Wrath, The", 238));
			bookRepository.save(new Book("Trial, The", 198));
			bookRepository.save(new Book("Statistical Decision Theory", 236));
			bookRepository.save(new Book("Data Mining Handbook", 242));
			bookRepository.save(new Book("New Machiavelli, The", 180));
			bookRepository.save(new Book("Physics & Philosophy", 197));
			bookRepository.save(new Book("Making Software", 232));
			bookRepository.save(new Book("Analysis, Vol I", 248));
			bookRepository.save(new Book("Machine Learning for Hackers", 233));
			bookRepository.save(new Book("Signal and the Noise, The", 233));
			bookRepository.save(new Book("Python for Data Analysis", 233));
			bookRepository.save(new Book("Introduction to Algorithms", 234));
			bookRepository.save(new Book("Beautiful and the Damned, The", 198));
			bookRepository.save(new Book("Outsider, The", 198));
			bookRepository.save(new Book("Complete Sherlock Holmes, The - Vol I", 176));
			bookRepository.save(new Book("Complete Sherlock Holmes, The - Vol II", 176));
			bookRepository.save(new Book("Wealth of Nations, The", 175));
			bookRepository.save(new Book("Pillars of the Earth, The", 176));
			bookRepository.save(new Book("Tao of Physics, The", 179));
			bookRepository.save(new Book("Surely Youre Joking Mr Feynman", 198));
			bookRepository.save(new Book("Farewell to Arms, A", 179));
			bookRepository.save(new Book("Veteran, The", 177));
			bookRepository.save(new Book("False Impressions", 177));
			bookRepository.save(new Book("Last Lecture, The", 197));
			bookRepository.save(new Book("Return of the Primitive", 202));
			bookRepository.save(new Book("Jurassic Park", 174));
			bookRepository.save(new Book("Russian Journal, A", 196));
			bookRepository.save(new Book("Tales of Mystery and Imagination", 172));
			bookRepository.save(new Book("Freakonomics", 197));
			bookRepository.save(new Book("Hidden Connections, The", 197));
			bookRepository.save(new Book("Story of Philosophy, The", 170));
			bookRepository.save(new Book("Asami Asami", 205));
			bookRepository.save(new Book("Journal of a Novel", 196));
			bookRepository.save(new Book("Once There Was a War", 196));
			bookRepository.save(new Book("Moon is Down, The", 196));
			bookRepository.save(new Book("Brethren, The", 174));
			bookRepository.save(new Book("In a Free State", 196));
			bookRepository.save(new Book("Catch 22", 178));
			bookRepository.save(new Book("Complete Mastermind, The", 178));
			bookRepository.save(new Book("Dylan on Dylan", 197));
			bookRepository.save(new Book("Soft Computing & Intelligent Systems", 242));
			bookRepository.save(new Book("Textbook of Economic Theory", 242));
			bookRepository.save(new Book("Econometric Analysis", 242));
			bookRepository.save(new Book("Learning OpenCV", 232));
			bookRepository.save(new Book("Data Structures Using C & C++", 235));
			bookRepository.save(new Book("Computer Vision, A Modern Approach", 255));
			bookRepository.save(new Book("Principles of Communication Systems", 240));
			bookRepository.save(new Book("Let Us C", 213));
			bookRepository.save(new Book("Amulet of Samarkand, The", 179));
			bookRepository.save(new Book("Crime and Punishment", 180));
			bookRepository.save(new Book("Angels & Demons", 178));
			bookRepository.save(new Book("Argumentative Indian, The", 209));
			bookRepository.save(new Book("Sea of Poppies", 197));
			bookRepository.save(new Book("Idea of Justice, The", 212));
			bookRepository.save(new Book("Raisin in the Sun, A", 175));
			bookRepository.save(new Book("All the Presidents Men", 177));
			bookRepository.save(new Book("Prisoner of Birth, A", 176));
			bookRepository.save(new Book("Scoop!", 216));
			bookRepository.save(new Book("Ahe Manohar Tari", 213));
			bookRepository.save(new Book("Last Mughal, The", 199));
			bookRepository.save(new Book("Social Choice & Welfare, Vol 39 No. 1", 235));
			bookRepository.save(new Book("Radiowaril Bhashane & Shrutika", 213));
			bookRepository.save(new Book("Gun Gayin Awadi", 212));
			bookRepository.save(new Book("Aghal Paghal", 212));
			bookRepository.save(new Book("Maqta-e-Ghalib", 221));
			bookRepository.save(new Book("Beyond Degrees", 222));
			bookRepository.save(new Book("Manasa", 213));
			bookRepository.save(new Book("India from Midnight to Milennium", 198));
			bookRepository.save(new Book("Worlds Greatest Trials, The", 210));
			bookRepository.save(new Book("Great Indian Novel, The", 198));
			bookRepository.save(new Book("O Jerusalem!", 217));
			bookRepository.save(new Book("City of Joy, The", 177));
			bookRepository.save(new Book("Freedom at Midnight", 167));
			bookRepository.save(new Book("Winter of Our Discontent, The", 196));
			bookRepository.save(new Book("On Education", 203));
			bookRepository.save(new Book("Free Will", 203));
			bookRepository.save(new Book("Bookless in Baghdad", 206));
			bookRepository.save(new Book("Case of the Lame Canary, The", 179));
			bookRepository.save(new Book("Theory of Everything, The", 217));
			bookRepository.save(new Book("New Markets & Other Essays", 176));
			bookRepository.save(new Book("Electric Universe", 201));
			bookRepository.save(new Book("Hunchback of Notre Dame, The", 175));
			bookRepository.save(new Book("Burning Bright", 175));
			bookRepository.save(new Book("Age of Discontuinity, The", 178));
			bookRepository.save(new Book("Doctor in the Nude", 179));
			bookRepository.save(new Book("Down and Out in Paris & London", 179));
			bookRepository.save(new Book("Identity & Violence", 219));
			bookRepository.save(new Book("Beyond the Three Seas", 197));
			bookRepository.save(new Book("Worlds Greatest Short Stories, The", 217));
			bookRepository.save(new Book("Talking Straight", 175));
			bookRepository.save(new Book("Maughams Collected Short Stories, Vol 3", 171));
			bookRepository.save(new Book("Phantom of Manhattan, The", 180));
			bookRepository.save(new Book("Ashenden of The British Agent", 160));
			bookRepository.save(new Book("Zen & The Art of Motorcycle Maintenance", 172));
			bookRepository.save(new Book("Great War for Civilization, The", 197));
			bookRepository.save(new Book("We the Living", 178));
			bookRepository.save(new Book("Artist and the Mathematician, The", 186));
			bookRepository.save(new Book("History of Western Philosophy", 213));
			bookRepository.save(new Book("Selected Short Stories", 215));

		};
	}
}

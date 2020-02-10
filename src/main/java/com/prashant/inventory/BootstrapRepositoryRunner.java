package com.prashant.inventory;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.prashant.inventory.commom.model.Attribute;
import com.prashant.inventory.commom.model.Comment;
import com.prashant.inventory.commom.model.Product;
import com.prashant.inventory.repository.ProductRepository;

@Component
public class BootstrapRepositoryRunner implements CommandLineRunner {

	private static final Logger LOG = LoggerFactory.getLogger(BootstrapRepositoryRunner.class);

	@Autowired
	private ProductRepository repository;

	@Override
	public void run(String... args) throws Exception {
		LOG.info("@Bootstrapping Application");
		
		repository.deleteAll();
			
		Product product = new Product();
		product.setRating(8l);
		product.setName("Kindle Paperwhite (10th gen)");
		product.setPrice(BigDecimal.valueOf(12999.00));
		product.setTags(Arrays.asList(new String[]{"Reading", "Learning","Kindle", "Paperwhite"}));
		Attribute firstAttribute = Attribute.builder().key("Display").value(
				"Amazon's 6” Paperwhite display technology with E Ink Carta and built-in light, 300ppi, optimized font technology, 16-level gray scale.")
				.build();
		Attribute secondAttribute = Attribute.builder().key("Built-in Front Light").value("Yes - 4 LEDs").build();
		Attribute thirdAttribute = Attribute.builder().key("Screen size").value("6\" glare-free ").build();
		Attribute fourthAttribute = Attribute.builder().key("Connectivity").value("Wi-Fi or Wi-Fi + Free 4G").build();
		Attribute fifthAttribute = Attribute.builder().key("Storage").value("8 GB or 32 GB").build();
		Attribute sixthAttribute = Attribute.builder().key("Content Formats Supported").value(
				"Kindle Format 8 (AZW3), Kindle (AZW), TXT, PDF, unprotected MOBI, PRC natively; HTML DOC, DOCX, JPEG, GIF, PNG, PMP through conversion.")
				.build();
		List<Attribute> attributes = new ArrayList<>();
		attributes.add(firstAttribute);
		attributes.add(secondAttribute);
		attributes.add(thirdAttribute);
		attributes.add(fourthAttribute);
		attributes.add(fifthAttribute);
		attributes.add(sixthAttribute);
		product.setAttributes(attributes);

		product.setDescription(
				"Kindle Paperwhite (10th gen) - 6\" High Resolution Display with Built-in Light, 8GB, Waterproof, WiFi ");
		product.setLargeDescription(
				"Kindle Paperwhite (10th gen) - 6\" High Resolution Display with Built-in Light, 8GB, Waterproof, WiFi.\r\n"
						+ "\r\n"
						+ "    The thinnest, lightest Kindle Paperwhite ever—300 ppi glare-free display, reads like real paper even in bright sunlight.\r\n"
						+ "    Now with twice the storage - 8GB - store thousands of books so you can take your library with you.\r\n"
						+ "    Now waterproof, so you’re free to read and relax at the beach, by the pool, or in the bath.\r\n"
						+ "    A single battery charge lasts weeks, not hours.\r\n"
						+ "    The built-in adjustable light lets you read indoors and outdoors, day and night.\r\n"
						+ "    Get instant access to new releases and bestsellers, plus over a million titles at INR 299 or less.\r\n"
						+ "    This device does not support playback of Audible audiobooks.\r\n" + " ");

		Comment comment1 = new Comment(
				"This product is aptly priced. I have used it a number of times and I can still see the qualitiy maintained over time.",
				LocalDate.now(), "Vinod Mehra", 144l, 12l);
		Comment comment2 = new Comment("Please don't waste time in purchashing this. Worst product ever.",
				LocalDate.now(), "Mukund Tripathi", 128l, 23l);
		Comment comment3 = new Comment(
				"Given the price is very low, you can try it once before you are convinced to move to a different product",
				LocalDate.now(), "Ram Lal", 133l, 76l);
		Comment comment4 = new Comment("I have purchased it two weeks back. No satisfied by the quality",
				LocalDate.now(), "Anthony Mishra", 324l, 123l);

		List<Comment> comments = new ArrayList<>();
		comments.add(comment1);
		comments.add(comment2);
		comments.add(comment3);
		comments.add(comment4);

		product.setComments(comments);

		repository.save(product);

	}

}

package com.sbms.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.itextpdf.text.*;
import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.sbms.entity.Candidate;
import com.sbms.service.CandidateServiceImpl;

import jakarta.servlet.http.HttpServletResponse;

@RestController
public class CandiateController {
	
	@Autowired
	private CandidateServiceImpl service;
	
	@PostMapping("/save")
	public Candidate saveCandidate(@RequestBody Candidate c) {
		return service.registerCandidate(c);
	}
	
	@GetMapping("/all") 
	public Iterable<Candidate> getAllUser(){
		return service.getAllUser();
	}
	
	@GetMapping("/download/{id}")
	public void downloadCandidate(@PathVariable int id, HttpServletResponse response) throws Exception {
		Candidate candidate = service.getAllUser() 
				.stream()
				.filter(u -> u.getId()==(id)) 
				.findFirst() 
				.orElseThrow();

	    // Set response headers for PDF download
	    response.setContentType("application/pdf");
	    response.setHeader("Content-Disposition", "attachment; filename=candidate_" + id + ".pdf");

	    //  Create PDF
	    Document document = new Document(PageSize.A4);
	    PdfWriter.getInstance(document, response.getOutputStream());
	    document.open();

	    // Title
	    Font titleFont = FontFactory.getFont(FontFactory.HELVETICA_BOLD, 18, BaseColor.BLACK);
	    Paragraph title = new Paragraph("Candidate Details", titleFont);
	    title.setAlignment(Element.ALIGN_CENTER);
	    title.setSpacingAfter(20f);
	    document.add(title);

	    // Create a table with 2 columns
	    PdfPTable table = new PdfPTable(2);
	    table.setWidthPercentage(100);
	    table.setSpacingBefore(10f);

	    // Define fonts
	    Font headerFont = FontFactory.getFont(FontFactory.HELVETICA_BOLD, 12, BaseColor.WHITE);
	    Font cellFont = FontFactory.getFont(FontFactory.HELVETICA, 12, BaseColor.BLACK);

	    // Helper function for cells
	    PdfPCell cell;

	    // Add rows (Label + Value)
	    table.addCell(getHeaderCell("Field", headerFont));
	    table.addCell(getHeaderCell("Details", headerFont));

	    table.addCell(getCell("Name", cellFont));
	    table.addCell(getCell(candidate.getFullname(), cellFont));

	    table.addCell(getCell("Email", cellFont));
	    table.addCell(getCell(candidate.getEmail(), cellFont));

	    table.addCell(getCell("Phone", cellFont));
	    table.addCell(getCell(candidate.getPhoneno(), cellFont));

	    table.addCell(getCell("Qualification", cellFont));
	    table.addCell(getCell(candidate.getHighest_qualification(), cellFont));

	    table.addCell(getCell("College", cellFont));
	    table.addCell(getCell(candidate.getCollege_name(), cellFont));

	    table.addCell(getCell("Address", cellFont));
	    table.addCell(getCell(candidate.getAddress(), cellFont));

	    table.addCell(getCell("Gender", cellFont));
	    table.addCell(getCell(candidate.getGender(), cellFont));

	    table.addCell(getCell("Experience", cellFont));
	    table.addCell(getCell(candidate.getExperience() + " years", cellFont));

	    document.add(table);
	    document.close();
	}

	//  Helper methods
	private PdfPCell getHeaderCell(String text, Font font) {
	    PdfPCell cell = new PdfPCell(new Phrase(text, font));
	    cell.setBackgroundColor(BaseColor.DARK_GRAY);
	    cell.setHorizontalAlignment(Element.ALIGN_CENTER);
	    cell.setPadding(8f);
	    return cell;
	}

	private PdfPCell getCell(String text, Font font) {
	    PdfPCell cell = new PdfPCell(new Phrase(text, font));
	    cell.setHorizontalAlignment(Element.ALIGN_LEFT);
	    cell.setPadding(8f);
	    return cell;
	}


	
	
}

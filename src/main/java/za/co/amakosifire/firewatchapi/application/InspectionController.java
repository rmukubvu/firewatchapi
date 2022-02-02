package za.co.amakosifire.firewatchapi.application;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import za.co.amakosifire.firewatchapi.application.dto.InspectionDetail;
import za.co.amakosifire.firewatchapi.application.dto.InspectionHead;
import za.co.amakosifire.firewatchapi.domain.InspectionService;

import java.net.URI;
import java.net.URISyntaxException;

@RestController
@RequestMapping("/api/v1/inspection")
@AllArgsConstructor
public class InspectionController {
    private InspectionService inspectionService;

    @GetMapping("/header")
    public ResponseEntity<?> inspectionHeader() {
        return ResponseEntity.ok().body(inspectionService.retrieveInspections());
    }

    @GetMapping("/details")
    public ResponseEntity<?> inspectionDetails() {
        return ResponseEntity.ok().body(inspectionService.retrieveInspectionDetails());
    }

    @PostMapping("/header")
    public ResponseEntity<?> post(@Validated @RequestBody InspectionHead header) throws URISyntaxException {
        inspectionService.addInspectionHeader(header.getHeaderName() , header.getDetails());
        return ResponseEntity.created(new URI("/api/v1/inspection/header")).body("Added");
    }

    @PostMapping("/details")
    public ResponseEntity<?> postDetails(@Validated @RequestBody InspectionDetail detail) throws URISyntaxException {
        inspectionService.addInspectionDetail(detail.getName());
        return ResponseEntity.created(new URI("/api/v1/inspection/details")).body("Added");
    }
}

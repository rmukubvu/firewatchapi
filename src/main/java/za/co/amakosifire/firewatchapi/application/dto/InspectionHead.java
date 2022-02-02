package za.co.amakosifire.firewatchapi.application.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Collection;

@Data
@AllArgsConstructor
public class InspectionHead {
    private String headerName;
    private Collection<String> details;
}

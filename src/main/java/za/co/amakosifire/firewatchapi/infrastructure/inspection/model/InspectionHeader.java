package za.co.amakosifire.firewatchapi.infrastructure.inspection.model;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Collection;

@Builder
@Data
@Document(collection = "inspection_sheet_header")
public class InspectionHeader {
    @Id
    private String id;
    private String header;
    private Collection<String> inspectionSheetDetails;
}

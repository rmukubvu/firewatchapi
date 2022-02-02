package za.co.amakosifire.firewatchapi.infrastructure.inspection.model;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Builder
@Document(collection = "inspection_sheet_details")
public class InspectionSheetDetails {
    @Id
    private String id;
    private String name;
}

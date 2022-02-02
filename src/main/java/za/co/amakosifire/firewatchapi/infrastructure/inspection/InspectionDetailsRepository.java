package za.co.amakosifire.firewatchapi.infrastructure.inspection;

import org.springframework.data.mongodb.repository.MongoRepository;
import za.co.amakosifire.firewatchapi.infrastructure.inspection.model.InspectionSheetDetails;

public interface InspectionDetailsRepository extends MongoRepository<InspectionSheetDetails, String> {
}

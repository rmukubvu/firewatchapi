package za.co.amakosifire.firewatchapi.infrastructure.inspection;

import org.springframework.data.mongodb.repository.MongoRepository;
import za.co.amakosifire.firewatchapi.infrastructure.inspection.model.InspectionHeader;


public interface InspectionHeaderRepository extends MongoRepository<InspectionHeader,String> {
}

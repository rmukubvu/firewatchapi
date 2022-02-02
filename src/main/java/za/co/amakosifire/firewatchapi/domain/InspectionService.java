package za.co.amakosifire.firewatchapi.domain;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import za.co.amakosifire.firewatchapi.infrastructure.inspection.InspectionHeaderRepository;
import za.co.amakosifire.firewatchapi.infrastructure.inspection.InspectionDetailsRepository;
import za.co.amakosifire.firewatchapi.infrastructure.inspection.model.InspectionHeader;
import za.co.amakosifire.firewatchapi.infrastructure.inspection.model.InspectionSheetDetails;

import java.util.Collection;

@Service
@AllArgsConstructor
public class InspectionService {

    private InspectionDetailsRepository inspectionDetailsRepository;
    private InspectionHeaderRepository inspectionHeaderRepository;

    public void addInspectionDetail(String detailName) {
        inspectionDetailsRepository.save(InspectionSheetDetails.builder().name(detailName).build());
    }

    public void addInspectionHeader(String headerName, Collection<String> detailList) {
        inspectionHeaderRepository.save(InspectionHeader.builder()
                        .header(headerName)
                        .inspectionSheetDetails(detailList)
                .build());
    }

    public Collection<InspectionHeader> retrieveInspections() {
        return inspectionHeaderRepository.findAll();
    }

    public Collection<InspectionSheetDetails> retrieveInspectionDetails() {
        return inspectionDetailsRepository.findAll();
    }

}

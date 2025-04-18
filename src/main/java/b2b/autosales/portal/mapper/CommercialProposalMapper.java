package b2b.autosales.portal.mapper;

import b2b.autosales.portal.models.CommercialProposal;
import b2b.autosales.portal.dto.request.create.CommercialProposalCreateRequest;
import b2b.autosales.portal.dto.request.update.CommercialProposalUpdateRequest;
import b2b.autosales.portal.dto.response.CommercialProposalResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

@Mapper(
        componentModel = "spring",
        uses = {OrganisationMapper.class, UserMapper.class, TenderMapper.class}
)
public interface CommercialProposalMapper {

    CommercialProposalResponse toCommercialProposalResponse(CommercialProposal commercialProposal);

    CommercialProposal toCommercialProposal(CommercialProposalResponse commercialProposalResponse);

    @Mapping(target = "id", ignore = true)
    CommercialProposal toCommercialProposal(CommercialProposalCreateRequest createCommercialProposalRequest);

    @Mapping(target = "id", ignore = true)
    CommercialProposal toCommercialProposal(CommercialProposalUpdateRequest updateCommercialProposalRequest);

    @Mapping(target = "id", ignore = true)
    void updateCommercialProposalFromRequest(CommercialProposalUpdateRequest updateCommercialProposalRequest, @MappingTarget CommercialProposal commercialProposal);
}
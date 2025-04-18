package b2b.autosales.portal.dto.request.create;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(description = "Registration Request Create Request DTO")
public record RegistrationRequestCreateRequest(
        @Schema(description = "First Name", example = "John")
        String firstname,

        @Schema(description = "Last Name", example = "Doe")
        String lastname,

        @Schema(description = "Middle Name", example = "A.")
        String middlename,

        @Schema(description = "Country", example = "USA")
        String country,

        @Schema(description = "City", example = "New York")
        String city,

        @Schema(description = "Company Name", example = "ABC Corp")
        String companyName,

        @Schema(description = "Legal Address", example = "123 Main St")
        String legalAdress,

        @Schema(description = "Email", example = "john.doe@example.com")
        String email,

        @Schema(description = "Login", example = "johndoe")
        String login,

        @Schema(description = "Password", example = "password1")
        String password,

        @Schema(description = "Phone Number", example = "+1234567890")
        String phoneNumber,

        @Schema(description = "Position", example = "Manager")
        String position,

        @Schema(description = "INN", example = "123456789")
        String inn,

        @Schema(description = "CEO Full Name", example = "John Doe")
        String ceoFullName,

        @Schema(description = "Website", example = "https://example.com")
        String website,

        @Schema(description = "Activity Type", example = "Manufacturing")
        String activityType,

        @Schema(description = "Additional Info", example = "Additional details")
        String additionalInfo
) {}
package flame

import flame.admin.SmeBusinessDto
import flame.admin.SmeContactsDto
import flame.admin.SmeDirectorDto
import flame.admin.SmeLegalComplianceDto
import flame.admin.SmeShareholderDto
import kollections.List
import koncurrent.Later

interface SmeAdminScheme {
    fun update(params: SmeContactsDto): Later<SmeDto>

    fun update(params: SmeBusinessDto) : Later<SmeDto>

    fun update(params: SmeLegalComplianceDto) : Later<SmeDto>

    fun updateShareholders(params: List<SmeShareholderDto>) : Later<SmeDto>

    fun updateDirectors(params: List<SmeDirectorDto>) : Later<SmeDto>
}
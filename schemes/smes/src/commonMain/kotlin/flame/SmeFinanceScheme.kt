package flame

import flame.finance.SmeBackOfficeDto
import flame.finance.SmeFinancialAcquisitionDto
import flame.finance.SmeFinancialStatusDto
import koncurrent.Later

interface SmeFinanceScheme {
    fun update(params: SmeBackOfficeDto): Later<SmeDto>

    fun update(params: SmeFinancialStatusDto): Later<SmeDto>

    fun update(params: SmeFinancialAcquisitionDto): Later<SmeDto>
}
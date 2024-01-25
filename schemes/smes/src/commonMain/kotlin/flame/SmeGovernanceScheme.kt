package flame

import flame.governance.SmeGovernanceDto
import koncurrent.Later

interface SmeGovernanceScheme {
    fun update(params: SmeGovernanceDto): Later<SmeDto>
}
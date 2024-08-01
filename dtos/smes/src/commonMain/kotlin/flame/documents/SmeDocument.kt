package flame.documents

interface SmeDocument {
    val label: String

    enum class List(override val label: String) : SmeDocument {
        CompanyProfile("company-profile"),
        BusinessPlan("business-plan"),
        CompanyRegistrationDocument("company-registration-document"),
        ShareholderRegister("shareholder-register"),
        TaxPin("tax-pin"),
        FundingApplicationRequest("funding-application-request"),
        BeeAffidavit("bee-affidavit"),
        PithDeck("pitch-deck")
    }

    enum class FinancialRecord(override val label: String): SmeDocument {
//        BalanceSheet("balance-sheet"),
//        IncomeStatement("income-statement"),
//        CashFlow("cash-flow"),
        CurrentYearFinancials("current-year-financials"),
        PriorYearFinancialStatementYear1("prior-year-financial-statement-year-1"),
        PriorYearFinancialStatementYear2("prior-year-financial-statement-year-2"),
        AssetRegister("asset-register"),
        FinancialProjections("financial-projections"),
        SalesPipeline("sales-pipeline")
    }


    enum class Additional(override val label: String) : SmeDocument {
        LetterOfIntent("letter-of-intent"),
        Quotations("quotations"),
        MouOrSaleOfAgreements("mou-or-sale-of-agreements"),
        Other("other")
    }

    class FinancialSpreadsheet:SmeDocument {
        override val label: String = "financial-spreadsheet"
    }
}
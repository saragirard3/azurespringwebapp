CREATE TABLE REVENUE (
                         REV_ID INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
                         DIST_ID INT,
                         FISCAL_YR INT,
                         GF_LOC_PropTax INT,
                         GF_LOC_PropTaxShift INT,
                         GF_LOC_Other INT,
                         GF_LOC_Total INT,
                         GF_STATE_GenEd INT,
                         GF_STATE_SpEd INT,
                         GF_STATE_Other INT,
                         GF_STATE_AidAdj INT,
                         GF_STATE_Total INT,
                         GF_FED_Total INT,
                         GF_Total INT,
                         FoodSvc INT,
                         CommSvc INT,
                         BldConst INT,
                         DebtSvc INT,
                         OPEB INT,
                         TOTAL_REV INT,
                         TOTAL_LOC_PropTax INT,
                         TOTAL_LOC_PropTaxShift INT,
                         TOTAL_LOC_Other INT,
                         TOTAL_STATE INT,
                         TOTAL_STATE_AidAdj INT,
                         TOTAL_FED INT
);

CREATE TABLE EXPENSE (
                         EXP_ID INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
                         DIST_ID INT,
                         FISCAL_YR INT,
                         DIST_LEV_ADM INT,
                         SCH_LEV_ADM INT,
                         REG_INST INT,
                         CTE INT,
                         SPED INT,
                         SA INT,
                         INST_SUP_SVC INT,
                         PUP_SUP_SVC INT,
                         OP_MAINT INT,
                         TRANS INT,
                         SUB_GF_OP INT,
                         EQUIPMENT INT,
                         LAND_BLD INT,
                         SUB_CAP_EXP INT,
                         TOT_GF_EXP INT,
                         FOOD_SVC INT,
                         COMM_SVC INT,
                         BLD_CONST INT,
                         DEBT_SVC INT,
                         OPEB_SVC INT
);

CREATE TABLE DISTRICTS (
                         D_ID INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
                         DIST_ID INT,
                         DIST_NAME VARCHAR(100),
                         METRO48 BOOLEAN,
                         MREA BOOLEAN,
                         SEE BOOLEAN,
                         AMSD BOOLEAN,
                         NONPUB BOOLEAN
);

CREATE TABLE ADM (
                           ADM_ID INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
                           DIST_ID INT,
                           FISCAL_YR INT,
                           ADM INT
);

CREATE TABLE USERS (
                     USER_ID INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
                     USERNAME VARCHAR(100),
                     FIRST_NAME VARCHAR(100),
                     LAST_NAME VARCHAR(100),
                     EMAIL VARCHAR(150),
                     DIST_ID INT
);
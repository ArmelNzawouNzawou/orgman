package ac.za.cput.adp3.xyzcongolmerate.factory.org;

import ac.za.cput.adp3.xyzcongolmerate.domain.org.Organisation;
import ac.za.cput.adp3.xyzcongolmerate.util.Helper;

public class OrganisationFactory {

    private static final String SUFFIX = Helper.getSuffixFromClassName(OrganisationFactory.class); // Expecting OF from (O)rganisation(F)actory.


      public static Organisation buildOrganisation(String organisationName) {

        /**
         * Your implementation goes here
         * INSTRUCTIONS
         * 1. Remove line [//TODO: implement method body ONLY!]
         * 2. Remove line [throw new UnsupportedOperationException("Not supported yet.");]
         * 3. Generate random id using SUFFIX (Hint: call generateRandomGivenSuffix method in Helper class)
         * 4. Build and return an object of Organisation
         */

        String random;

       random = Helper.generateRandomGivenSuffix(SUFFIX);

        return new Organisation.Builder()
                               .orgCode(random)
                               .orgName(organisationName)
                               .build();
    }
}

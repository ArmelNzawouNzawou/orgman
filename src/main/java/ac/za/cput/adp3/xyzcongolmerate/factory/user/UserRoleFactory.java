package ac.za.cput.adp3.xyzcongolmerate.factory.user;

import ac.za.cput.adp3.xyzcongolmerate.domain.user.UserRole;

public class UserRoleFactory {


    public static UserRole buildUserRole(String orgCode, String userEmail, String roleId) {

        /**
         * Your implementation goes here
         * INSTRUCTIONS
         * 1. Remove line [//TODO: implement method body ONLY!]
         * 2. Remove line [throw new UnsupportedOperationException("Not supported yet.");]
         * 3. Build and return an object of UserRole
         */

        return new UserRole(orgCode , userEmail, roleId);


    }
}

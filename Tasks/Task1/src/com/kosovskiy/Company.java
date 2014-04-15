/***********************************************************************
 * Module:  Company.java
 * Author:  Юрий
 * Purpose: Defines the Class Company
 ***********************************************************************/

package com.kosovskiy;

import java.util.*;

/** @pdOid 8300ae3c-29c7-4eeb-b01c-0d28e187b8cf */
public class Company {
   /** @pdOid e8c63ffd-8097-4957-8c13-8d16abbe5052 */
   private int name;
   
   /** @pdRoleInfo migr=no name=Department assc=association2 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<Department> department;
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<Department> getDepartment() {
      if (department == null)
         department = new java.util.HashSet<Department>();
      return department;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorDepartment() {
      if (department == null)
         department = new java.util.HashSet<Department>();
      return department.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newDepartment */
   public void setDepartment(java.util.Collection<Department> newDepartment) {
      removeAllDepartment();
      for (java.util.Iterator iter = newDepartment.iterator(); iter.hasNext();)
         addDepartment((Department)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newDepartment */
   public void addDepartment(Department newDepartment) {
      if (newDepartment == null)
         return;
      if (this.department == null)
         this.department = new java.util.HashSet<Department>();
      if (!this.department.contains(newDepartment))
         this.department.add(newDepartment);
   }
   
   /** @pdGenerated default remove
     * @param oldDepartment */
   public void removeDepartment(Department oldDepartment) {
      if (oldDepartment == null)
         return;
      if (this.department != null)
         if (this.department.contains(oldDepartment))
            this.department.remove(oldDepartment);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllDepartment() {
      if (department != null)
         department.clear();
   }

}
/***********************************************************************
 * Module:  Department.java
 * Author:  Юрий
 * Purpose: Defines the Class Department
 ***********************************************************************/

package com.kosovskiy;

import java.util.*;

/** @pdOid a1a02105-7588-4ca9-82da-595f2e513c57 */
public class Department {
   /** @pdOid 2fdf5471-dd2b-41e1-b2c2-c24a136233c7 */
   private int name;
   
   /** @pdRoleInfo migr=no name=Employer assc=association1 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<Employer> employer;
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<Employer> getEmployer() {
      if (employer == null)
         employer = new java.util.HashSet<Employer>();
      return employer;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorEmployer() {
      if (employer == null)
         employer = new java.util.HashSet<Employer>();
      return employer.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newEmployer */
   public void setEmployer(java.util.Collection<Employer> newEmployer) {
      removeAllEmployer();
      for (java.util.Iterator iter = newEmployer.iterator(); iter.hasNext();)
         addEmployer((Employer)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newEmployer */
   public void addEmployer(Employer newEmployer) {
      if (newEmployer == null)
         return;
      if (this.employer == null)
         this.employer = new java.util.HashSet<Employer>();
      if (!this.employer.contains(newEmployer))
         this.employer.add(newEmployer);
   }
   
   /** @pdGenerated default remove
     * @param oldEmployer */
   public void removeEmployer(Employer oldEmployer) {
      if (oldEmployer == null)
         return;
      if (this.employer != null)
         if (this.employer.contains(oldEmployer))
            this.employer.remove(oldEmployer);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllEmployer() {
      if (employer != null)
         employer.clear();
   }

}
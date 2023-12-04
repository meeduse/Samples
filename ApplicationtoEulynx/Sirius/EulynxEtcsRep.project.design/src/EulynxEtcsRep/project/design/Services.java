package EulynxEtcsRep.project.design;

import org.eclipse.emf.ecore.EObject;

import eTCSData.Train;
import extractedMM.TvpSection;
import extractedMM.VirtualSubSection;

import java.sql.Time;
import java.util.Iterator;

/**
 * The services class used by VSM.
 */
public class Services {
    
	
	private static final String List = null;
    /**
    * See http://help.eclipse.org/neon/index.jsp?topic=%2Forg.eclipse.sirius.doc%2Fdoc%2Findex.html&cp=24 for documentation on how to write service methods.
    */
    public EObject myService(EObject self, String arg) {
       // TODO Auto-generated code
      return self;
    }
    
    public EObject getOthers(EObject self, EObject arg) {
    	System.out.println(arg);
    	
    	if (arg instanceof Train) {
			Train t = (Train) arg;
			for (VirtualSubSection vss  : t.getOccupyFront()) {
				System.out.println(vss.getAppliesToTvpsection());
			}
		}
        // TODO Auto-generated code
       return self;
     }
    
       
    
    
   
    
}

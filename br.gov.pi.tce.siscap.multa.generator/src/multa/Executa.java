package multa;

import java.util.Scanner;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.mwe.core.WorkflowContext;
import org.eclipse.emf.mwe.core.issues.Issues;
import org.eclipse.emf.mwe.core.lib.AbstractWorkflowComponent;
import org.eclipse.emf.mwe.core.monitor.ProgressMonitor;
import br.gov.pi.tce.siscap.multa.Multa;
import br.gov.pi.tce.siscap.multa.ConjuntoMulta;

 
public class Executa extends AbstractWorkflowComponent {
 	@Override
 	public void checkConfiguration(Issues issues) { }
 
	protected void invokeInternal(WorkflowContext ctx, ProgressMonitor monitor, Issues issues) {
    	EObject model = (EObject) ctx.get("model");
    	ConjuntoMulta conjuntoMulta = (ConjuntoMulta)model;
    	Multa multaAtual = null;
    	
    	for(Multa m: conjuntoMulta.getMultas()) {
        	if(m.isInicio()) { multaAtual = m;  break;  }
    	}
    	
    	if(multaAtual == null) {
            issues.addError("Não existe mensagem definida como inicial!");        
    	}
        
    	System.out.println("Empresa: " + multaAtual.getEmpresa() + "Valor: " + multaAtual.getValor() + "Justificativa: " + multaAtual.getJustificativa() + "Link Evidência: " + multaAtual.getLinkEvidencia() + "/n");
      
	}	
	
}


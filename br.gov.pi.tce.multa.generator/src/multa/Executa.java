package multa;

import java.util.Scanner;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.mwe.core.WorkflowContext;
import org.eclipse.emf.mwe.core.issues.Issues;
import org.eclipse.emf.mwe.core.lib.AbstractWorkflowComponent;
import org.eclipse.emf.mwe.core.monitor.ProgressMonitor;
import br.gov.pi.tce.siscap.multa.Multa;

public class Executa extends AbstractWorkflowComponent {
	@Override
	public void checkConfiguration(Issues issues) {
	}

	protected void invokeInternal(WorkflowContext ctx, ProgressMonitor monitor, Issues issues) {
		EObject model = (EObject) ctx.get("model");
		Multa multa = (Multa) model;
		
		System.out.println("Cadastro de Multas - SISCAP");

		String opcao;
		Scanner console;

		do {
			System.out.println("Informe o nome da empresa penalizada: ");
			console = new Scanner(System.in);
			multa.setEmpresa(console.nextLine());

			System.out.println("Informe o valor da multa: ");
			console = new Scanner(System.in);
			multa.setValor(console.nextInt());

			System.out.println("Informe a justificativa da multa: ");
			console = new Scanner(System.in);
			multa.setJustificativa(console.nextLine());

			System.out.println("Informe o link que evidencia a multa: ");
			console = new Scanner(System.in);
			multa.setLinkEvidencia(console.nextLine());

			do {
				System.out.println("Deseja cadastrar mais uma multa? Sim (S) ou Não (N)");
				console = new Scanner(System.in);
				opcao = console.nextLine();

				if (opcao != "S" && opcao != "N") {
					System.out.println("Opção inválida, digite Sim (S) ou Não (N)");
				}

			} while (opcao != "S" && opcao != "N");
			
			System.out.println("Multa da empresa " + multa.getEmpresa() + " no valor " + multa.getValor() + " reais, sob a justificativa " + multa.getJustificativa() + " conforme evidência no link " + multa.getLinkEvidencia() + " foi cadastrada com sucesso!");

		} while (opcao == "S");
		
		try {
			console.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

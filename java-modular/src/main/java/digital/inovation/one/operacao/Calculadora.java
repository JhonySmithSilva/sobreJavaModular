/*
 * este codigo foi copiado da video aula de java modular
 * da Digital Inovation One
 * todo o conteudo aqui é apenas de uso acadêmico
 */
package digital.inovation.one.operacao;

import digital.inovation.one.operacao.internal.*;
/**
 *
 * @author jony_
 */
public class Calculadora {
    
    private SumHelper sumHelper;
    private SubHelper subHelper;
    private MultHelper multHelper;
    private DivHelper divHelper;

    public Calculadora() {
        sumHelper = new SumHelper();
        subHelper = new SubHelper();
        multHelper = new MultHelper();
        divHelper = new DivHelper();
    }   
    
    public int sum(int a, int b) {
         return sumHelper.execute(a,b);
    }
    
    public int subtraction(int a, int b) {
         return subHelper.execute(a,b);
    }
    
    public int multplication(int a, int b) {
         return multHelper.execute(a,b);
    }
    
    public int divsion(int a, int b) {
         return divHelper.execute(a,b);
    }
    
}

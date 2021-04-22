/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package digital.inovation.one.operacao.internal;

import digital.inovation.one.operacao.Operacao;

/**
 *
 * @author jony_
 */
public class SumHelper implements Operacao{

    @Override
    public int execute(int a, int b) {        
        return a + b;
    }
    
}

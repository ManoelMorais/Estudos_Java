package TratamentoDeExcecoes.MetodoRuimMedioBom.Bom;

import java.io.Serial;

public class Execoes extends RuntimeException {
    @Serial
    private  static final long serialVersionUID = 1L;

    public Execoes(String msg){
        super(msg);
    }
}

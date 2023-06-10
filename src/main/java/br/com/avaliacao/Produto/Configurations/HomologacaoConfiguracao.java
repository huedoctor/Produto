package br.com.avaliacao.Produto.Configurations;

import br.com.avaliacao.Produto.Services.DBService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.text.ParseException;

@Configuration
@Profile("homologacao")
public class HomologacaoConfiguracao {

    @Autowired
    DBService dbService;

    private Boolean instaciar() throws ParseException{
        this.dbService.instanciarDB();
        return true;
    }
}

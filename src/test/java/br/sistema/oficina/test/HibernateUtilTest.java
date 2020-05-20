package br.sistema.oficina.test;
import org.hibernate.Session;
import org.junit.Test;

import br.sistema.oficina.util.HibernateUtil;

public class HibernateUtilTest {

	@Test
	public void conectar() {
		Session sessao = HibernateUtil.getFabricaDeSessoes().openSession();
		sessao.close();
		HibernateUtil.getFabricaDeSessoes().close();
	}
}

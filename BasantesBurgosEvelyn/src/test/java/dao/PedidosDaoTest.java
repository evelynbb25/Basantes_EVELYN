

package dao;
public class PedidosDaoTest {
    @org.junit.Test
    public void testRead() {
        System.out.println("read");
        Integer idPedido = null;
        PedidosDao instance = new PedidosDao();
        Pedido expResult = null;
        Pedido result = instance.read(idPedido);
        assertEquals(expResult, result);
        
        fail("The test case is a prototype.");
    }

}

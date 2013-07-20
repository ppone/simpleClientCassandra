package romp;
import java.util.List;
import java.io.UnsupportedEncodingException;

import org.apache.thrift.transport.TTransport;
import org.apache.thrift.transport.TFramedTransport;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.TException;
import org.apache.thrift.transport.TTransportException;
import org.apache.cassandra.thrift.InvalidRequestException;
import org.apache.cassandra.service.*;
import org.apache.cassandra.thrift.*;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
     throws TTransportException, TException, InvalidRequestException 
    {

        TTransport tr = new TFramedTransport(new TSocket("localhost", 9160));
        TProtocol proto = new TBinaryProtocol(tr);
        Cassandra.Client client = new Cassandra.Client(proto);
        tr.open();
        //ColumnPath path = new ColumnPath("Standard1", null, "name".getBytes("UTF-8"));
        System.out.println(client);
        tr.close();
    }
}

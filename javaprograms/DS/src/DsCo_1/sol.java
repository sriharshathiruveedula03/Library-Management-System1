package DsCo_1;
import java.util.*;
import java.io.*;
public class sol
{
     public static void main(String[] args) throws IOException
     {
      Reader R=new Reader();
      int n=R.nextInt(); // Size of array
      long a[]=new long[n+1];
      a[0]=-1;
   
      for(int i=1;i<=n;i++) // Get array data
       a[i]=R.nextLong();
      int f[]=new int[n+1];
      int g[]=new int[n+1];
   
      ArrayDeque<Integer> dq=new ArrayDeque<Integer>();
      dq.offerLast(1);
      for(int i=2;i<=n;i++)
      {
        while(!dq.isEmpty() && a[dq.peekLast()]<a[i])
        {
        f[dq.pollLast()]=i;
        dq.offerLast(i);
        }
      }
      while(!dq.isEmpty())
      {
       f[dq.pollLast()]=-1;
      dq.offerLast(1);
      }
      
      for(int i=2;i<=n;i++)
      {
       while(!dq.isEmpty() && a[dq.peekLast()]>a[i])
       {
        g[dq.pollLast()]=i;
       dq.offerLast(i);
       }
      }
      while(!dq.isEmpty())
      {
       g[dq.pollLast()]=-1;
      }
        StringBuilder sb = new StringBuilder();
      for(int i=1; i<=n; i++)
      {
       if(f[i]==-1 || g[f[i]]==-1 )
       {
      sb.append(-1 + " ");
       }
       else
       {
        sb.append(a[g[f[i]]] + " ");
       }
      }
      System.out.println(sb.toString());
     }
     
     static class Reader 
     {
            final private int BUFFER_SIZE = 1 << 16;
            private DataInputStream din;
            private byte[] buffer;
            private int bufferPointer, bytesRead;
     
            public Reader() 
            {
                din = new DataInputStream(System.in);
                buffer = new byte[BUFFER_SIZE];
                bufferPointer = bytesRead = 0;
            }
     
            public Reader(String file_name) throws IOException 
            {
                din = new DataInputStream(new FileInputStream(file_name));
                buffer = new byte[BUFFER_SIZE];
                bufferPointer = bytesRead = 0;
            }
     
            public String readLine() throws IOException
            {
                byte[] buf = new byte[64]; // line length
                int cnt = 0, c;
                while ((c = read()) != -1) 
                {
                    if (c == '\n')
                    {
                        break;
                     }
                    buf[cnt++] = (byte) c;
                    
                }
                return new String(buf, 0, cnt);
            }
     
            public int nextInt() throws IOException 
            {
                int ret = 0;
                byte c = read();
                while (c <= ' ')
                {
                    c = read();
                }
                boolean neg = (c == '-');
                
                if (neg)
                {
                    c = read();
                }
                do
                {
                    ret = ret * 10 + c - '0';
                }
                while ((c = read()) >= '0' && c <= '9');
                {
     
                if (neg)
                {
                    return -ret;
                }
                return ret;
                }
            }
     
            public char nextChar() throws IOException 
            {
                int ret = 0;
                byte c = read();
                while (c <= ' ')
                {
                    c = read();
                }
                return (char) c;
            }
     
            public long nextLong() throws IOException 
            {
                long ret = 0;
                byte c = read();
                while (c <= ' ')
                {
                    c = read();
                }
                boolean neg = (c == '-');
                if (neg)
                {
                    c = read();
                }
                do
                {
                    ret = ret * 10 + c - '0';
                }
                while ((c = read()) >= '0' && c <= '9');
                if (neg)
                {
                    return -ret;
                }
                return ret;
            }
     
            public double nextDouble() throws IOException
            {
                double ret = 0, div = 1;
                byte c = read();
                while (c <= ' ')
                    c = read();
                boolean neg = (c == '-');
                if (neg)
                {
                    c = read();
                    {
                    do
                    {
                    ret = ret * 10 + c - '0';
                    
                }
                while ((c = read()) >= '0' && c <= '9');
                 {
                	 if (c == '.') 
                	 {
                       while ((c = read()) >= '0' && c <= '9')
                       {
                         ret += (c - '0') / (div *= 10);
                       }
                    }
                }  
     
                if (neg)
                {
                    return -ret;
                }
                return ret;
                    }
                }
				return c;
            }
            private void fillBuffer() throws IOException
            {
                bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE);
                if (bytesRead == -1)
                {
                    buffer[0] = -1;
                }
            }
     
            private byte read() throws IOException 
            {
                if (bufferPointer == bytesRead)
                {
                    fillBuffer();
                }
                return buffer[bufferPointer++];
            }
     
            public void close() throws IOException 
            {
                if (din == null)
                {
                    return;
                }
                din.close();
            }
        }
}

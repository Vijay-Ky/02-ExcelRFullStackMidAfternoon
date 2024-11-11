import java.io.IOException;
class InsufficientBalanceException extends OutOfMemoryError//extends IOException
{
	InsufficientBalanceException(String msg)
	{
		super(msg);
	}
}

USE [duan1]
GO

DECLARE	@return_value int

EXEC	@return_value = [dbo].[sp_BaiKiemTra_TusinhID]

SELECT	'Return Value' = @return_value

GO

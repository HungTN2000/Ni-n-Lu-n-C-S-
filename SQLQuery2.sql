create proc sp_BaiKiemTra_TusinhID
as
begin
declare @ma_next varchar(20)
declare @max int
---Khởi tạo 2 biến @ma_next là mã tự sinh và max là tổng số bản ghi hiện có sau đó mình sẽ cộng mã thêm 1
---Ở đây mình sẽ viết mã có dạng KH...
Select @max = COUNT(MaBKT) + 1 from BaiKiemTra where MaBKT like 'BKT'
set @ma_next='BKT' + RIGHT('0' + CAST(@max as varchar(18)), 18)
---Bây giờ kiểm tra xem mã đã tồn tại hay chưa
while(exists(Select MaBKT from BaiKiemTra where MaBKT=@ma_next))
begin
	set @max=@max+1
	set @ma_next='BKT' + RIGHT('0' + CAST(@max as varchar(18)), 18)
end
Select @ma_next
end

select * from chude
UPDATE ChuDe

SET TenChuDe = 'Animals'

WHERE TenChuDe = 'Animals';
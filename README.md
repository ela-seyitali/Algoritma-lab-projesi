# Algorithma Lab Projesi
# Yurt Giriş-Çıkış ve Yönetim Sistemi

## Projenin Amacı

Bu projenin amacı, bir yurt yönetim sisteminin oluşturulmasıdır. Bu sistem, yurda giriş-çıkış yapan öğrencilerin takibini sağlamak, yurt kurallarını göstermek ve yurttaki personellerin bilgilerini veri tabanı olan txt dosyaları üzerinde kaydedip düzenlemektir. Proje, öğrencilerin yurda giriş-çıkış yapabilmelerini, idari personelin yeni öğrenci veya görevli kaydı oluşturabilmesi ve görevli personelin görev ve takvim bilgilerini düzenleyebilmesini vb. işlemleri sağlar.

## Proje Tasarımı

### 1. Sınıflar ve Bileşenler

#### a) Personel
Bu sınıf, yurt yönetimindeki tüm personelin temel bilgilerini içerir. Bu sınıftan kalıtım yoluyla türeyen alt sınıflar:
- **Ogrenci**: Öğrenci bilgilerini tutar ve oğrenciyi çağırma işlemlerini yapar.
- **Idari**: İdari personelin bilgilerini tutar (Kalıtım yoluyla).
- **Gorevli**: Görevli personelin bilgilerini ve görevlerini (Görev atamalarını) yönetir.

#### b) Dosya
Bu sınıf, verileri dosyalardan okur ve dosyalara yazar. Dosya ile ilgili tüm işlemleri yapar.

### 2. Txt Dosyaları

- **KullaniciBilgileri**: Tüm kullanıcıların bilgilerini tutar.
- **IdariPerosnelBilgileri**: İdari personellerin bilgilerini tutar.
- **OgrenciBilgileri.txt**: Öğrenci bilgilerini tutan dosya.
- **YurtKurallari.txt**: Yurt kurallarını içeren dosya.

### 3. Metodlar

- `setYurttaMi()`: Öğrencinin yurtta olup olmadığını belirler.
- `getStringYurttaMi()`: YurttaMi boolean değerini string'e çevirir.
- `GorevliYeniKayıt()`: Yeni bir görevli için yeni kayıt oluşturur.
- `OgrenciYeniKayıt()`: Yeni bir öğrenci için yeni kayıt oluşturur.
- `yurdaGiris()`: Öğrencinin yurda girişini yapar ve yurttaMi bilgisini günceller.
- `cikisYap()`: Öğrencinin yurttan çıkışını yapar ve yurttaMi bilgisini günceller.
- `setAdSoyad()`: Kullanıcının adını ve soyadını alır.
- `ogrenciCagirma()`: İdari ya da görevli personel öğrenciyi çağırır.
- `gorevliAdlari()`: Görevlilerin ad ve soyadlarını döndürür.
- `gorevAtamalariniGor()`: Görevlilerin görevlerini sergiler.
- `setDosyaYolu()`: Dosya yolunu alır ve değişkene kaydeder.
- `getDosyaYolu()`: Dosya yolunu döndürür.
- `dosyayaYaz()`: İstediğimiz dosyaya veri yazdırır.
- `dosyadanOku()`: İstediğimiz dosyadan veri okur.
- `dosyaMevcutMu()`: Dosyanın var olup olmadığını kontrol eder.

## Projenin İşleyişi

### 1. Öğrencinin Yurda Giriş ve Çıkışı

- Kullanıcı adını girdikten sonra, sistem öğrencinin `OgrenciBilgileri.txt` dosyasındaki kaydını bulur.
- Öğrenci yurttaysa (`yurttaMi = true`), çıkış yapabilir. Çıkış yaptığında, `yurttaMi` bilgisi `false` olarak güncellenir.
- Öğrenci yurtta değilse (`yurttaMi = false`), giriş yapabilir. Giriş yaptığında, `yurttaMi` bilgisi `true` olarak güncellenir.

### 2. Yurt Kurallarının Gösterilmesi

Personeller, "Yurt kurallarını görüntüleme" işlemini seçtiklerinde yurt kuralları dosyadan okunup ekranda görüntülenebilir.

## Sonuç ve Değerlendirme

Bu proje, bir yurt yönetim sisteminin temel işlevlerini başarıyla yerine getirmektedir. Öğrencilerin yurda giriş-çıkış takibi, yurt kurallarının görüntülenmesi ve personel bilgileri gibi kritik işlemler etkili bir şekilde gerçekleştirilmektedir. Proje, txt dosyaları kullanarak verilerin saklanması ve yönetilmesi açısından pratik bir çözüm sunmaktadır.

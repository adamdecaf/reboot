package dispatch

private[dispatch] trait UrlFormatting {
  import java.net.{URLDecoder, URLEncoder}

  private[this] val defaultCharset = "utf-8"

  def encode(s: String, charset: String = defaultCharset) = URLEncoder.encode(s, charset)

  def decode(s: String, charset: String = defaultCharset) = URLDecoder.decode(s, charset)

}

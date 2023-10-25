import React from "react";
// import SignUp_Login from "./SignUp_Login";
import { Link } from "react-router-dom";
import Features from "./Features";
import FAQs from "./FAQs";
import prof from "./Images/hero-2-img.png";
import cro from "./Images/crossPlatform.png";
import eff from "./Images/effortLessIntegration.png";
import eng from "./Images/engagementAnalytics.png";
import kro from "./Images/img-06.png";
// import icon1 from "./Images/icon1.JPG";
import prof1 from "./Images/img-13.png";
import tablet from "./Images/tablet-02.png";
import fifth from "./Images/img-05.png";
import second from "./Images/img-02.png";
import dashboard from "./Images/dashboard-01.png";
import fa from "./Images/f_06.png";
import fa1 from "./Images/f_04.png";
import fa2 from "./Images/img-03.png";
import icon5 from "./Images/icon5.JPG";
import icon6 from "./Images/icon6.JPG";
import icon7 from "./Images/icon7.JPG";
import fa3 from "./Images/img-14.png";
import tool_1 from "./Images/tool-1.png";
import tool_2 from "./Images/tool-2.png";
import tool_3 from "./Images/tool-3.png";
import tool_4 from "./Images/tool-4.png";
import tool_5 from "./Images/tool-5.png";
import tool_6 from "./Images/tool-6.png";
import tool_7 from "./Images/tool-7.png";
import tool_8 from "./Images/tool-8.png";
import tool_9 from "./Images/tool-9.png";
import logo from "./Images/logo-pink.png";
import SignUp_Login from "./SignUp_Login";
import { useState } from "react";

export default function Navbar() {
  const [isDivVisible, setDivVisible] = useState(false);

  const toggleDiv = () => {
    setDivVisible(!isDivVisible);
  };
  console.log("hi", isDivVisible);
  return (
    <>
      <div className="header">
        <div className="navbar">
          <div className="logo">
            <div>
              <img
                src="https://dsathemes.com/html/martex_1.1/files/images/logo-pink.png"
                width="100%"
                height={34.74}
                alt=""
              />
            </div>
          </div>
          <div className="mainbar">
            <div className="main1 ka" onMouseLeave={toggleDiv}>

              <li onMouseEnter={toggleDiv} >
                About
              </li>
             
            </div>
            {isDivVisible && 
                <div className="AboutPractice">
                  <ul>
                    <li>
                      <a href="#a@">Why Matrix?</a>
                    </li>
                    <li>
                      <a href="#b@">Best Solutins</a>
                    </li>
                    <li>
                      <a href="#c@">How It Works</a>
                    </li>
                    <li>
                      <a href="#d@">Integrations</a>
                    </li>
                  </ul>
                </div>
              }
            <div className="main1 k2">
              <li>
                <a href="#Features">Features</a>
              </li>
            </div>
            <div className="main1">
              <li>Pages</li>
            </div>
            <div className="main1">
              <li>Pricing</li>
            </div>
            <div className="main1 k2">
              <li>
                <a href="#faq">FAQs</a>
              </li>
            </div>
            <div className="main1 k2">
              <li>
                <Link to="/SignUp">Sign In</Link>
              </li>
            </div>
            <div className="main1 k2">
              <li>
                <Link to="/SignUp">Sign Up</Link>
              </li>
            </div>
          </div>
        </div>
      </div>

      <section className="hero1">
        <div className="container">
          <div className="cont">
            <div className="img1">
              <img src={prof} alt="image" />
            </div>
            <div className="texthero1">
              <h1 style={{ fontSize: "60px" }}>
                Realize your digital <br /> potential with <br />
                Martex
              </h1>
              <p>
                Tempor sapien sodales quaerat ipsum congue ipsum laoreet turpis
                neque auctor turpis a vitae dolor luctus placerat magna and
                ligula cursus purus ipsum
              </p>
              <div className="kero">
                <h2>
                  2 <span>x</span>
                </h2>
                <p>
                  Tempor sapien and <br /> quaerat placerat
                </p>
                <h2>
                  63 <span>%</span>
                </h2>
                <p>
                  Ligula suscipit vitae <br />
                  and rutrum turpis
                </p>
              </div>
            </div>
          </div>
        </div>
      </section>
      <section className="hero3">
        <div className="textd">
          <div className="text">
            <h2>Build a customer-centric marketing strategy</h2>
            <p>Ligula risus auctor tempus magna feugiat lacinia.</p>
          </div>
        </div>
        <div className="one">
          <div className="one1">
            <div className="img2">
              <img src={cro} alt="" />
            </div>

            <div className="desc">
              <h6>Cross-Platform</h6>
              <p>
                Luctus egestas augue undo ultrice aliquam <br /> in lacus congue
                dapibus
              </p>
            </div>
          </div>
          <div className="one1">
            <div className="img2">
              <img src={eff} alt="" />
            </div>

            <div className="desc">
              <h6>Effortless Integration</h6>
              <p>
                Luctus egestas augue undo ultrice aliquam <br /> in lacus congue
                dapibus
              </p>
            </div>
          </div>
          <div className="one1">
            <div className="img2">
              <img src={eng} alt="" />
            </div>

            <div className="desc">
              <h6>Engagement Analytics</h6>
              <p>
                Luctus egestas augue undo ultrice aliquam <br /> in lacus congue
                dapibus
              </p>
            </div>
          </div>
        </div>
      </section>
      <section className="hero4" id="a@">
        <div className="hero4Content">
          <div className="img3">
            <img src={kro} alt="" />
          </div>
          <div className="right4sec">
            <span> DATA INTEGRATION</span>
            <h2>Create a workflow that works for you</h2>
            <p id="para1">
              <span></span>
              Sodales tempor sapien quaerat ipsum undo congue laoreet turpis
              neque auctor turpis vitae dolor luctus placerat magna and ligula
              cursus purus vitae purus an ipsum suscipit
            </p>
            <h5>Enhance your personality</h5>

            <p>
              {" "}
              <span>
                <i class="fa-solid fa-check" style={{ color: "red" }}></i>
              </span>
              Magna dolor luctus at egestas sapien
            </p>
            <p id="para2">
              <i class="fa-solid fa-check" style={{ color: "red" }}></i>
              Cursus purus suscipit vitae cubilia magnis volute egestas vitae
              sapien turpis ultrice auctor congue varius magnis
            </p>
            <p>
              <i class="fa-solid fa-check" style={{ color: "red" }}></i>Volute
              turpis dolores and sagittis congue
            </p>
          </div>
        </div>
      </section>
      <Features />

      <section className="hero6">
        <div className="hero6Content">
          <div className="img4">
            <img src={prof1} alt="" />
          </div>
          <div className="right6sec">
            <h5>Solution that grows with you</h5>
            <p>
              Sodales tempor sapien quaerat ipsum undo congue laoreet turpis
              neque auctor turpis vitae dolor luctus placerat magna and ligula
              cursus purus vitae purus an ipsum suscipit
            </p>
            <h5>Connect your data sources</h5>
            <p>
              Tempor sapien sodales quaerat ipsum undo congue laoreet turpis
              neque auctor turpis vitae dolor luctus placerat magna and ligula
              cursus purus an ipsum vitae suscipit purus
            </p>
            <p id="para4" style={{ margin: "0px 0px 0px 15px" }}>
              Tempor sapien quaerat an ipsum laoreet purus and sapien dolor an
              ultrice ipsum aliquam undo congue dolor cursus
            </p>
            <p id="para4" style={{ margin: "0px 0px 0px 15px" }}>
              Cursus purus suscipit vitae cubilia magnis volute egestas vitae
              sapien turpis ultrice auctor congue magna placerat
            </p>
          </div>
        </div>
      </section>

      <section className="hero7" id="b@">
        <div className="hero7Content">
          <div className="leftHero7">
            <div className="leftContent7">
              <div className="roundLine">
                <div className="round">1</div>
                <div className="line"></div>
              </div>
              <div className="cans">
                <h5>Extension & Addons</h5>
                <p>
                  Ligula risus auctor tempus feugiat dolor lacinia nemo purus in
                  lipsum purus sapien quaerat a primis viverra tellus vitae
                  luctus dolor ipsum neque ligula quaerat
                </p>
              </div>
            </div>
            <div className="leftContent7">
              <div className="roundLine">
                <div className="round">2</div>
                <div className="line"></div>
              </div>
              <div className="cans">
                <h5>Improved Productiviy</h5>
                <p>
                  Ligula risus auctor tempus feugiat dolor lacinia nemo purus in
                  lipsum purus sapien quaerat a primis viverra tellus vitae
                  luctus dolor ipsum neque ligula quaerat
                </p>
              </div>
            </div>
            <div className="leftContent7">
              <div className="roundLine">
                <div className="round">3</div>
              </div>
              <div className="cans">
                <h5>Customizable Dashboard</h5>
                <p>
                  Ligula risus auctor tempus feugiat dolor lacinia nemo purus in
                  lipsum purus sapien quaerat a primis viverra tellus vitae
                  luctus dolor ipsum neque ligula quaerat
                </p>
              </div>
            </div>
          </div>
          <div className="rightHero7">
            <div className="img5">
              <img src={tablet} alt="" />
            </div>
          </div>
        </div>
      </section>

      <section className="hero8">
        <div className="hero8Content">
          <div className="left8">
            <img src={fifth} alt="" />
          </div>
          <div className="right8">
            <span>EASY ONBOARDING</span>
            <h2>Achieve more with better workflows</h2>
            <p>
              Nemo ipsam egestas volute turpis egestas ipsum and purus sapien
              ultrice an aliquam quaerat ipsum augue turpis sapien cursus congue
              magna purus quaerat at ligula purus egestas magna cursus undo
              varius purus magnis sapien quaerat
            </p>
            <h5>Get more done in less time</h5>
            <p id="para">
              Sapien quaerat tempor an ipsum laoreet purus and sapien dolor an
              ultrice ipsum aliquam undo congue cursus dolor
            </p>
            <p>
              Purus suscipit cursus vitae cubilia magnis volute egestas vitae
              sapien turpis ultrice auctor congue magna placerat
            </p>
          </div>
        </div>
      </section>

      <section className="hero9">
        <div className="hero9Content">
          <div className="left9">
            <span>EASY INTEGRATION</span>
            <h2>Plug your essential tools in few clicks</h2>
            <p>
              Cursus purus suscipit vitae cubilia magnis volute egestas vitae
              sapien turpis sodales magna undo aoreet primis
            </p>
            <p>
              Tempor sapien quaerat an ipsum laoreet purus and sapien dolor an
              ultrice ipsum aliquam undo congue dolor cursus purus congue and
              ipsum purus sapien a blandit
            </p>
          </div>
          <div className="right9">
            <img src={second} alt="" />
          </div>
        </div>
      </section>
      <section className="hero10" id="c@">
        <div className="heroContent10">
          <div className="first1">
            <h2>Track the progress towards objectives with key results</h2>
            <p>Ligula risus auctor tempus magna feugiat lacinia.</p>
          </div>
          <div className="second">
            <img src={dashboard} alt="" />
          </div>
          <div className="vid">
            <iframe
              width="560"
              height="315"
              src="https://www.youtube.com/embed/7e90gBu4pas"
              frameborder="0"
              allowfullscreen
            ></iframe>
          </div>
        </div>
      </section>
      <section className="hero11">
        <div className="hero11Content">
          <div className="pef">
            <div style={{ width: "150px" }}>
              <h2 style={{ fontSize: "53px" }}>
                <span>89</span>k
              </h2>
            </div>
            <div>
              <p style={{ fontSize: "22px" }}>
                porta justo integer and velna vitae auctor
              </p>
            </div>
          </div>
          <div className="pef">
            <div style={{ width: "150px" }}>
              <h2 style={{ fontSize: "53px" }}>
                <span>79</span>%
              </h2>
            </div>
            <div>
              <p style={{ fontSize: "22px" }}>
                Ligula magna suscipit vitae and rutrum
              </p>
            </div>
          </div>
          <div className="pef">
            <div style={{ width: "150px" }}>
              <h2 style={{ fontSize: "53px" }}>
                <span>4.</span>93
              </h2>
            </div>
            <div>
              <p style={{ fontSize: "22px" }}>
                Sagittis congue augue egestas an egestas
              </p>
            </div>
          </div>
        </div>
      </section>
      <section className="hero12">
        <div className="hero12Content">
          <div className="first12">
            <h2> Reach your audience through social media marketing</h2>
            <p>Ligula risus auctor tempus magna feugiat lacinia.</p>
          </div>
          <div className="middle">
            <div className="left12">
              <h5>Marketing Integrations</h5>
              <p>
                Aliquam a augue suscipit luctus diam neque purus ipsum neque and
                dolor primis libero
              </p>
              <div className="img12">
                <img src={fa} alt="" />
              </div>
            </div>
            <div className="right12">
              <div className="img12">
                <img src={fa1} alt="" />
              </div>
              <h5>Enhance Engagement</h5>
              <p>
                Aliquam a augue suscipit luctus diam neque purus ipsum neque and
                dolor primis libero
              </p>
            </div>
          </div>
        </div>
      </section>
      <section className="hero13" id="d@">
        <div className="hero13Content">
          <div className="first13">
            <h2>The Complete Solutions</h2>
            <p>Ligula risua auctor tempus magna feugiat lacinia</p>
          </div>
          <div className="middle13">
            <div className="left13">
              <div className="left131">
                <div className="logodiv">
                  <span>
                    <img src={icon5} alt="" />
                  </span>
                  <h5>Built-in automation</h5>
                </div>
                <p>
                  Quaerat sodales sapien blandit purus primis purus ipsum
                  cubilia laoreet augue luctus and magna dolor luctus egestas an
                  ipsum sapien primis vitae volute and magna turpis
                </p>
              </div>
              <div className="left131">
                <div className="logodiv">
                  <span>
                    <img src={icon6} alt="" />
                  </span>
                  <h5>Automatic workflows</h5>
                </div>
                <p>
                  Quaerat sodales sapien blandit purus primis purus ipsum
                  cubilia laoreet augue luctus and magna dolor luctus egestas an
                  ipsum sapien primis vitae volute and magna turpis
                </p>
              </div>
              <div className="left131">
                <div className="logodiv">
                  <span>
                    <img src={icon7} alt="" />
                  </span>
                  <h5>Real-time analytics</h5>
                </div>
                <p>
                  Quaerat sodales sapien blandit purus primis purus ipsum
                  cubilia laoreet augue luctus and magna dolor luctus egestas an
                  ipsum sapien primis vitae volute and magna turpis
                </p>
              </div>
            </div>
            <div className="right131">
              <img src={fa2} alt="" />
            </div>
          </div>
        </div>
      </section>

      <section className="hero14">
        <div className="hero14Content">
          <div className="left14">
            <img src={fa3} alt="" />
          </div>
          <div className="right14">
            <span>ENGAGEMENT ANALYTICS</span>
            <h2>Data-driven digital marketing</h2>
            <p>
              Tempor sapien quaerat undo ipsum laoreet purus and sapien dolor
              ociis ultrice ipsum aliquam undo congue dolor cursus congue varius
              magnis
            </p>
            <p>
              Cursus purus suscipit vitae cubilia magnis diam volute egestas
              sapien ultrice auctor
            </p>
          </div>
        </div>{" "}
      </section>
      <section className="hero15">
        <div className="hero15Content">
          <div className="first15">
            <h2>Automate your workflow with our integrations</h2>
            <p>Ligula risus asuctor magna feugiat lacina.</p>
          </div>
          <div className="middle15">
            <div className="child-item">
              <div className="img15">
                <img src={tool_1} alt="" />
              </div>
              <div>
                <h6>Zapier</h6>
                <p>Share findingssssd</p>
              </div>
            </div>
            <div className="child-item">
              <div className="img15">
                <img src={tool_2} alt="" />
              </div>
              <div>
                <h6>Zapier</h6>
                <p>Share findingssssd</p>
              </div>
            </div>
            <div className="child-item">
              <div className="img15">
                <img src={tool_3} alt="" />
              </div>
              <div>
                <h6>Zapier</h6>
                <p>Share findingssssd</p>
              </div>
            </div>
            <div className="child-item">
              <div className="img15">
                <img src={tool_4} alt="" />
              </div>
              <div>
                <h6>Zapier</h6>
                <p>Share findingssssd</p>
              </div>
            </div>
            <div className="child-item">
              <div className="img15">
                <img src={tool_5} alt="" />
              </div>
              <div>
                <h6>Zapier</h6>
                <p>Share findingssssd</p>
              </div>
            </div>
            <div className="child-item">
              <div className="img15">
                <img src={tool_6} alt="" />
              </div>
              <div>
                <h6>Zapier</h6>
                <p>Share findingssssd</p>
              </div>
            </div>
            <div className="child-item">
              <div className="img15">
                <img src={tool_7} alt="" />
              </div>
              <div>
                <h6>Zapier</h6>
                <p>Share findingssssd</p>
              </div>
            </div>
            <div className="child-item">
              <div className="img15">
                <img src={tool_8} alt="" />
              </div>
              <div>
                <h6>Zapier</h6>
                <p>Share findingssssd</p>
              </div>
            </div>
            <div className="child-item">
              <div className="img15">
                <img src={tool_9} alt="" />
              </div>
              <div>
                <h6>Zapier</h6>
                <p>Share findingssssd</p>
              </div>
            </div>
          </div>

          <div className="btn-15">
            <button>View all integrations</button>
          </div>
        </div>
      </section>
      {/* <section className="hero16">
        <div className="hero-16_Content">
          <div className="firstC">
            <div className="first-16">
              <h2>Our Happy Customers</h2>
              <p>Ligula risus auctor tempus magna feugiat lacinia</p>
            </div>
          </div>
        </div>
      </section> */}

      <FAQs />

      <section className="hero18">
        <div className="hero18Content">
          <div className="des18">
            <h2>Starting with Martex is easy, fast and free</h2>
            <p style={{ fontSize: "22px" }}>
              It only takes a few clicks to get started
            </p>
            <button>Get started -its free</button>
            <p> &#10004; Free for 14 days, no credit card required.</p>
          </div>
        </div>
      </section>
      <footer>
        <div className="footerContent">
          <div className="div">
            <img src={logo} width={172} alt="" />
          </div>
          <div className="div">
            <h6>Comapany</h6>
            <a href="About Us">About Us</a>
            <a href="Careers">Careers</a>
            <a href="Our Blog">Our Blog</a>
            <a href="Contact Us">Contact Us</a>
          </div>
          <div className="div">
            <h6>Product</h6>
            <a href="Integration">Integration</a>
            <a href="Customers">Customers</a>
            <a href="Pricing">Pricing</a>
            <a href="Help Center">Help Center</a>
          </div>
          <div className="div">
            <h6>Legal</h6>
            <a href="Terms of Use">Terms of Use</a>
            <a href="Privacy Policy">Privacy Policy</a>
            <a href="Cooking Policy">Cooking Policy</a>
            <a href="Site Map">Site Map</a>
          </div>
          <div className="div">
            <h6>Connect With Us</h6>
            <p>hello@youdomain.com</p>
          </div>
        </div>
      </footer>
    </>
  );
}

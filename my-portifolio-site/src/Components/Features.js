import React from 'react';
import icon1 from "./Images/icon1.JPG";

export default function Features() {
  return (
    <>
      <section className="hero5" id="Features">
        <div className="hero5Content">
          <div className="desc1">
            <span>ONE-STOP SOLUTION</span>
            <h2>Smart solutions, real-timer results</h2>
            <ul>
              <li id="list1">
                Tempor sapien quaerat undo ipsum laoreet purus and sapien dolor
                ociis ultrice ipsum aliquam undo congue dolor cursus congue
                varius magnis
              </li>
              <li id="list2">
                Cursus purus suscipit vitae cubilia magnis diam volute egestas
                sapien ultrice auctor
              </li>
            </ul>
            <div className="btn">
              <button>Get started now</button>
            </div>
          </div>
          <div className="desc2">
            <div className="desc21">
              <div className="desc211">
                <div className="icon">
                  <img src={icon1} alt="" />
                </div>
                <h5> Market Research</h5>
                <p>
                  Porta semper lacus and cursus feugiat at primis ultrice a
                  ligula auctor
                </p>
              </div>
              <div className="desc211">
                <div className="icon">
                  <img src={icon1} alt="" />
                </div>
                <h5> Market Research</h5>
                <p>
                  Porta semper lacus and cursus feugiat at primis ultrice a
                  ligula auctor
                </p>
              </div>
            </div>
            <div className="desc21">
              <div className="desc211">
                <div className="icon">
                  <img src={icon1} alt="" />
                </div>
                <h5> Market Research</h5>
                <p>
                  Porta semper lacus and cursus feugiat at primis ultrice a
                  ligula auctor
                </p>
              </div>
              <div className="desc211">
                <div className="icon">
                  <img src={icon1} alt="" />
                </div>
                <h5> Market Research</h5>
                <p>
                  Porta semper lacus and cursus feugiat at primis ultrice a
                  ligula auctor
                </p>
              </div>
            </div>
          </div>
        </div>
      </section>
    </>
  )
}
